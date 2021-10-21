import com.shephertz.app42.server.domain.Zone;
import com.shephertz.app42.server.idomain.*;

public class DemoZoneAdapter extends BaseZoneAdaptor {

    private IZone zone;
    public DemoZoneAdapter(IZone zone) {
        this.zone=zone;
    }

    @Override
    public void handleAddUserRequest(IUser user, String authData, HandlingResult result) {
        System.out.println("Add User:"+user.getName());
    }

    @Override
    public void handleCreateRoomRequest(IUser user, IRoom room, HandlingResult result) {
        System.out.println("handleCreateRoomRequest:"+room.getName());
        room.setAdaptor(new DemoRoom(room));
    }
}
