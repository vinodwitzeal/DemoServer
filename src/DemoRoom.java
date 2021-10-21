import com.shephertz.app42.server.idomain.BaseRoomAdaptor;
import com.shephertz.app42.server.idomain.HandlingResult;
import com.shephertz.app42.server.idomain.IRoom;
import com.shephertz.app42.server.idomain.IUser;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoRoom extends BaseRoomAdaptor {

    private IRoom room;
    public DemoRoom(IRoom room) {
        this.room=room;
    }

    @Override
    public void handleChatRequest(IUser sender, String message, HandlingResult result) {
        super.handleChatRequest(sender, message, result);
    }

    @Override
    public void handleUpdatePeersRequest(IUser sender, byte[] update, HandlingResult result) {
        super.handleUpdatePeersRequest(sender, update, result);
    }

    @Override
    public void onUserLeaveRequest(IUser user) {
        super.onUserLeaveRequest(user);
    }

    @Override
    public void handleUserJoinRequest(IUser user, HandlingResult result) {
        System.out.println("handleUserJoinRequest:"+user.getName());
    }

    @Override
    public void onTimerTick(long time) {
        super.onTimerTick(time);
    }

    @Override
    public void handlePropertyChangeRequest(IUser sender, HashMap<String, Object> addOrUpdateMap, ArrayList<String> removeKeysList, HandlingResult result) {
        super.handlePropertyChangeRequest(sender, addOrUpdateMap, removeKeysList, result);
    }

    @Override
    public void handleLockPropertiesRequest(IUser sender, HashMap<String, Object> locksToUpdate, HandlingResult result) {
        super.handleLockPropertiesRequest(sender, locksToUpdate, result);
    }

    @Override
    public void onUnlockPropertiesRequest(IUser sender, ArrayList<String> unlockKeysList) {
        super.onUnlockPropertiesRequest(sender, unlockKeysList);
    }

    @Override
    public void handleUserSubscribeRequest(IUser sender, HandlingResult result) {
        super.handleUserSubscribeRequest(sender, result);
    }

    @Override
    public void onUserUnsubscribeRequest(IUser sender) {
        super.onUserUnsubscribeRequest(sender);
    }
}
