package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg6 implements ta4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ta4
    public final void a() {
        switch (this.a) {
            case 0:
                wg6 wg6Var = (wg6) this.b;
                wg6Var.c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                kz8 kz8Var = (kz8) this.c;
                synchronized (a69.b) {
                    LinkedHashMap linkedHashMap = a69.c;
                    a69 a69Var = (a69) linkedHashMap.get(str);
                    if (a69Var != null) {
                        a69Var.a.remove(kz8Var);
                        if (a69Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            a69Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
