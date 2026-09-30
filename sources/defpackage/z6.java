package defpackage;

import android.hardware.SensorManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z6 implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6(x48 x48Var, u48 u48Var, Object obj, int i) {
        this.a = i;
        this.c = x48Var;
        this.b = u48Var;
        this.d = obj;
    }

    @Override // defpackage.qa4
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((x16) obj3).invoke();
                ((x48) obj2).k().b((y6) obj);
                break;
            case 1:
                ((jsd) obj3).remove(obj2);
                ((uy) obj).d.k(obj2);
                break;
            case 2:
                LinkedHashMap linkedHashMap = ((tt1) obj3).c;
                String str = (String) obj2;
                if (linkedHashMap.get(str) == ((ou1) obj)) {
                    linkedHashMap.remove(str);
                }
                break;
            case 3:
                da9 da9Var = (da9) obj2;
                ((q84) obj3).b().c(da9Var);
                ((jsd) obj).remove(da9Var);
                break;
            case 4:
                ((x48) obj2).k().b((xm0) obj3);
                kq6 kq6Var = (kq6) obj;
                kq6Var.M0 = false;
                kq6Var.f();
                kq6Var.f();
                break;
            case 5:
                ((x48) obj2).k().b((ap2) obj3);
                sm6 sm6Var = (sm6) ((mmb) obj).element;
                if (sm6Var != null) {
                    sm6Var.a.unregisterReceiver(sm6Var.b);
                }
                break;
            case 6:
                ((x48) obj2).k().b((ap2) obj3);
                ds0 ds0Var = (ds0) ((mmb) obj).element;
                if (ds0Var != null) {
                    ds0Var.a();
                }
                break;
            case 7:
                rcc rccVar = (rcc) obj3;
                xcc xccVar = (xcc) obj;
                if (rccVar.b.k(obj2) == xccVar) {
                    Map map = rccVar.a;
                    Map mapD = xccVar.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            default:
                ((SensorManager) obj3).unregisterListener((exe) obj2);
                ((e89) obj).setValue(fxe.c);
                break;
        }
    }

    public /* synthetic */ z6(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
