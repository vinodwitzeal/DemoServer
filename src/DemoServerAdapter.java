import com.shephertz.app42.server.domain.Zone;
import com.shephertz.app42.server.idomain.BaseServerAdaptor;
import com.shephertz.app42.server.idomain.IZone;

public class DemoServerAdapter extends BaseServerAdaptor {


    @Override
    public void onZoneCreated(IZone zone) {
        System.out.println("Zone Created:"+zone.getName());
        zone.setAdaptor(new DemoZoneAdapter(zone));
    }

    @Override
    public void onZoneDeleted(IZone zone) {
        System.out.println("Zone Deleted:"+zone.getName());
        super.onZoneDeleted(zone);
    }
}
