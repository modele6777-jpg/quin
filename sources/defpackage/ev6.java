package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev6 implements xzc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ev6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xzc
    public final void a(zzc zzcVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hv6 hv6Var = (hv6) obj;
                if (hv6Var.d() != null) {
                    cee ceeVar = hv6Var.z;
                    ceeVar.getClass();
                    p8c.m();
                    ceeVar.f = true;
                    utb utbVar = ceeVar.d;
                    if (utbVar != null) {
                        p8c.m();
                        if (!utbVar.d.b.isDone()) {
                            jv6 jv6Var = new jv6(3, "The request is aborted silently and retried.", null);
                            p8c.m();
                            utbVar.g = true;
                            tv1 tv1Var = utbVar.i;
                            Objects.requireNonNull(tv1Var);
                            tv1Var.cancel(true);
                            utbVar.e.d(jv6Var);
                            utbVar.f.b(null);
                            cee ceeVar2 = utbVar.b;
                            oq0 oq0Var = utbVar.a;
                            p8c.m();
                            b21.q("TakePictureManagerImpl", "Add a new request for retrying.");
                            ceeVar2.a.addFirst(oq0Var);
                            ceeVar2.c();
                        }
                    }
                    hv6Var.E(true);
                    String strF = hv6Var.f();
                    iv6 iv6Var = (iv6) hv6Var.i;
                    hq0 hq0Var = hv6Var.j;
                    hq0Var.getClass();
                    vzc vzcVarF = hv6Var.F(strF, iv6Var, hq0Var);
                    hv6Var.x = vzcVarF;
                    Object[] objArr = {vzcVarF.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    hv6Var.C(Collections.unmodifiableList(arrayList));
                    hv6Var.q();
                    cee ceeVar3 = hv6Var.z;
                    ceeVar3.getClass();
                    p8c.m();
                    ceeVar3.f = false;
                    ceeVar3.c();
                    break;
                }
                break;
            case 1:
                wta wtaVar = (wta) obj;
                if (wtaVar.d() != null) {
                    wtaVar.G((yta) wtaVar.i, wtaVar.j);
                    wtaVar.q();
                    break;
                }
                break;
            default:
                Iterator it = ((yzc) obj).n.iterator();
                while (it.hasNext()) {
                    ((xzc) it.next()).a(zzcVar);
                }
                break;
        }
    }
}
