package info.xiaomo.server.gate.server.client;

import info.xiaomo.core.network.mina.config.MinaClientConfig;
import info.xiaomo.core.network.mina.service.SingleMinaTcpClientService;

/**
 * 连接到集群管理
 *
 * @date 2017-04-05
 */
public class Gate2ClusterClient extends SingleMinaTcpClientService {

  public Gate2ClusterClient(MinaClientConfig minaClientConfig) {
    super(minaClientConfig);
  }
}
