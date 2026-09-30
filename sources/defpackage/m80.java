package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m80 extends j6 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ q80 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(q80 q80Var, Context context) {
        super(q80Var);
        this.d = q80Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.j6
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.j6
    public final int i() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                psd psdVar = (psd) obj;
                LocationManager locationManager = (LocationManager) psdVar.c;
                e8e e8eVar = (e8e) psdVar.d;
                if (e8eVar.b <= System.currentTimeMillis()) {
                    Context context = (Context) psdVar.b;
                    Location lastKnownLocation2 = null;
                    if (feg.u(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (feg.u(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        yx0 yx0Var = yx0.f;
                        if (yx0Var == null) {
                            yx0Var = new yx0();
                            yx0.f = yx0Var;
                        }
                        yx0 yx0Var2 = yx0Var;
                        yx0Var2.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        yx0Var2.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = yx0Var2.d == 1;
                        long j2 = yx0Var2.c;
                        long j3 = yx0Var2.b;
                        yx0Var2.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = yx0Var2.c;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        e8eVar.a = z;
                        e8eVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = e8eVar.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.j6
    public final void r() {
        int i = this.c;
        q80 q80Var = this.d;
        switch (i) {
            case 0:
                q80Var.p(true, true);
                break;
            default:
                q80Var.p(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(q80 q80Var, psd psdVar) {
        super(q80Var);
        this.d = q80Var;
        this.e = psdVar;
    }
}
