package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0d extends BroadcastReceiver {
    public static final IntentFilter b;
    public final tx8 a;

    static {
        IntentFilter intentFilter = new IntentFilter();
        b = intentFilter;
        intentFilter.addAction("com.mixpanel.properties.register");
        intentFilter.addAction("com.mixpanel.properties.unregister");
    }

    public z0d(tx8 tx8Var) {
        this.a = tx8Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap map;
        String action = intent.getAction();
        if (!"com.mixpanel.properties.register".equals(action)) {
            if ("com.mixpanel.properties.unregister".equals(action)) {
                tx8 tx8Var = this.a;
                if (tx8Var.f()) {
                    return;
                }
                p9a p9aVar = tx8Var.g;
                synchronized (p9aVar.g) {
                    if (p9aVar.f == null) {
                        p9aVar.g();
                    }
                    p9aVar.f.remove("$mp_replay_id");
                    p9aVar.j();
                }
                return;
            }
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("data");
        if (serializableExtra instanceof HashMap) {
            try {
                map = (HashMap) serializableExtra;
            } catch (ClassCastException e) {
                db6.G("SessionReplayBroadcastReceiver", "Failed to cast broadcast extras data to HashMap", e);
                db6.D("SessionReplayBroadcastReceiver", "Broadcast extras data: " + serializableExtra);
                map = null;
            }
        } else {
            map = null;
        }
        if (map == null || !map.containsKey("$mp_replay_id")) {
            return;
        }
        tx8 tx8Var2 = this.a;
        if (tx8Var2.f()) {
            return;
        }
        try {
            tx8Var2.j(new JSONObject(map));
        } catch (NullPointerException unused) {
            db6.h1("MixpanelAPI.API", "Can't have null keys in the properties of registerSuperPropertiesMap");
        }
    }
}
