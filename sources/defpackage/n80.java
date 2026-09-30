package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public n80(w3h w3hVar) {
        this.a = 7;
        this.b = w3hVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((j6) obj).r();
                break;
            case 1:
                ej0 ej0Var = (ej0) obj;
                if (!isInitialStickyBroadcast()) {
                    ej0Var.b(bj0.b(context, intent, (xi0) ej0Var.y, (AudioDeviceInfo) ej0Var.x, ej0Var.a()));
                }
                break;
            case 2:
                context.getClass();
                intent.getClass();
                vw0 vw0Var = (vw0) obj;
                switch (vw0Var.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            ff8.h().e(ww0.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        vw0Var.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        vw0Var.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        vw0Var.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        vw0Var.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            ff8.h().e(xw0.a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        vw0Var.b(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    vw0Var.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            ff8.h().e(p2e.a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        vw0Var.b(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    vw0Var.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 3:
                ((kq6) obj).h();
                break;
            case 4:
                JSONObject jSONObject = new JSONObject();
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                if (bundleExtra != null) {
                    for (String str : bundleExtra.keySet()) {
                        try {
                            jSONObject.put(str, bundleExtra.get(str));
                        } catch (JSONException e) {
                            db6.G("MixpanelAPI.AL", "failed to add key \"" + str + "\" to properties for tracking bolts event", e);
                        }
                    }
                }
                ((tx8) obj).k("$" + intent.getStringExtra("event_name"), jSONObject);
                break;
            case 5:
                ((te9) obj).a.execute(new xu8(3, this, context));
                break;
            case 6:
                ((hfg) obj).b(intent);
                break;
            default:
                w3h w3hVar = (w3h) obj;
                if (intent == null) {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.x.a("App receiver called with null intent");
                } else {
                    String action4 = intent.getAction();
                    if (action4 == null) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.x.a("App receiver called with null action");
                    } else {
                        int iHashCode3 = action4.hashCode();
                        if (iHashCode3 != -1928239649) {
                            if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                w0h w0hVar3 = w3hVar.f;
                                w3h.h(w0hVar3);
                                w0hVar3.Z.a("[sgtm] App Receiver notified batches are available");
                                m3h m3hVar = w3hVar.g;
                                w3h.h(m3hVar);
                                m3hVar.J0(new jfg(19, this));
                            }
                            break;
                        } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            upg.a();
                            if (w3hVar.d.L0(null, bzg.P0)) {
                                w0h w0hVar4 = w3hVar.f;
                                w3h.h(w0hVar4);
                                w0hVar4.Z.a("App receiver notified triggers are available");
                                m3h m3hVar2 = w3hVar.g;
                                w3h.h(m3hVar2);
                                m3hVar2.J0(new jfg(20, w3hVar));
                                break;
                            }
                        }
                        w0h w0hVar5 = w3hVar.f;
                        w3h.h(w0hVar5);
                        w0hVar5.x.a("App receiver called with unknown action");
                    }
                }
                break;
        }
    }

    public /* synthetic */ n80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
