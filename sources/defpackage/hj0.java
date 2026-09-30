package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj0 implements u8e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u8e
    public final Object get() {
        lp3 lp3Var;
        int i = this.a;
        Context applicationContext = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                return kj0.d0((Context) obj);
            case 1:
                return new k47((Context) obj);
            case 2:
                return new yr3(new a90((Context) obj, 26), new sq3());
            case 3:
                return new au3((Context) obj);
            case 4:
                Context context = (Context) obj;
                yob yobVar = lp3.p;
                synchronized (lp3.class) {
                    lp3Var = lp3.v;
                    if (lp3Var == null) {
                        if (context != null) {
                            applicationContext = context.getApplicationContext();
                        }
                        HashMap map = new HashMap(8);
                        map.put(0, 1000000L);
                        map.put(2, -9223372036854775807L);
                        map.put(3, -9223372036854775807L);
                        map.put(4, -9223372036854775807L);
                        map.put(5, -9223372036854775807L);
                        map.put(10, -9223372036854775807L);
                        map.put(9, -9223372036854775807L);
                        map.put(7, -9223372036854775807L);
                        lp3Var = new lp3(applicationContext, map);
                        lp3.v = lp3Var;
                    }
                    break;
                }
                return lp3Var;
            default:
                try {
                    return (yp8) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
