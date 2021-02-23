package info.xiaomo.server.rpg.server;

import info.xiaomo.gengine.network.NetworkServiceBuilder;
import info.xiaomo.gengine.network.NetworkServiceImpl;
import info.xiaomo.server.rpg.server.back.BackMessageAndHandler;
import info.xiaomo.server.rpg.server.back.BackMessageRouter;
import info.xiaomo.server.rpg.server.game.ServerOption;

/**
 * Copyright(©) 2015 by xiaomo.
 **/

public class BackServer {

    private final NetworkServiceImpl service;

    public BackServer(ServerOption option) {
        BackMessageAndHandler pool = new BackMessageAndHandler();
        int bossLoopGroupCount = 1;
        int workerLoopGroupCount = 4;
        NetworkServiceBuilder builder = new NetworkServiceBuilder();
        builder.setBossLoopGroupCount(bossLoopGroupCount);
        builder.setWorkerLoopGroupCount(workerLoopGroupCount);
        builder.setPort(option.getBackServerPort());
        builder.setImessageandhandler(pool);
        builder.setConsumer(new BackMessageRouter());

        service = builder.createService();
    }

    public void start() {
        service.start();
    }

    public void stop() {
        service.stop();
    }
}