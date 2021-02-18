package info.xiaomo.server.fishscript.room;

import java.time.LocalTime;

import info.xiaomo.server.fish.script.IRoomScript;
import info.xiaomo.server.shared.entity.room.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 房间角色监测更新
 *
 *
 * 2017年9月26日 下午2:28:29
 */
public class RoomRoleUpdateScript implements IRoomScript {
	private static final Logger LOGGER=LoggerFactory.getLogger(RoomRoleUpdateScript.class);

	@Override
	public void secondHandler(Room room, LocalTime localTime) {
		room.getRoles().forEach((seat,role)->{
//			//TODO 测试
//			RMap<Long, Item> items = (RMap<Long, Item>)role.getItems();
//			if(items!=null) {
//				Item item = items.get(380220319399937L);
//				item.setNum(item.getNum()+1);
//				items.put(380220319399937L, item);
//				LOGGER.debug("道具：{}",item.toString());
//			}
		});
	}

	@Override
	public void minuteHandler(Room room, LocalTime localTime) {
		
		room.getRoles().forEach((seat,role)->{
			//更新金币
			if(role.getWinGold()!=0) {
//				role.syncGold(Reason.RoleSync);
			}
		});
	}

}
