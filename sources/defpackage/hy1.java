package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hy1 implements goe {
    public final boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object v;

    public hy1(hh hhVar, vrb vrbVar, cib cibVar, boolean z) {
        List listK;
        vrbVar.getClass();
        this.c = hhVar;
        this.d = vrbVar;
        this.e = cibVar;
        this.a = z;
        pu4 pu4Var = pu4.a;
        this.f = pu4Var;
        this.g = pu4Var;
        this.v = new ArrayList();
        ct6 ct6Var = hhVar.h;
        cibVar.d.getClass();
        URI uriJ = ct6Var.j();
        if (uriJ.getHost() == null) {
            listK = keg.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = hhVar.g.select(uriJ);
            listK = (listSelect == null || listSelect.isEmpty()) ? keg.k(new Proxy[]{Proxy.NO_PROXY}) : keg.j(listSelect);
        }
        this.f = listK;
        this.b = 0;
        tz4 tz4Var = cibVar.d;
        List list = (List) this.f;
        tz4Var.getClass();
        list.getClass();
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-2105352820);
        int i2 = i | (l46Var.g(this) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            qk6 qk6Var = qk6.O0;
            String string = ((use) this.c).d().c.toString();
            bx9 bx9VarR = ynb.r(0.0f, ((yi4) ((h0e) this.g).getValue()).a, 56.0f, ((yi4) ((h0e) this.v).getValue()).a + (((Integer) this.d) != null ? 20.0f : 0.0f), 1);
            s8f s8fVar = m8c.w;
            Object obj = this.e;
            dd2 dd2VarB0 = af1.b0(1212671828, new os1(this.b, 2), l46Var);
            wne wneVar = (wne) this.f;
            qk6Var.V(string, dd2Var, this.a, false, s8fVar, (t69) obj, false, null, dd2VarB0, null, wneVar, bx9VarR, af1.b0(-1640180961, new kg(this.a, (t69) obj, wneVar, 3), l46Var), l46Var, 100887600, 16064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(this, dd2Var, i, 16);
        }
    }

    public boolean a() {
        return this.b < ((List) this.f).size() || !((ArrayList) this.v).isEmpty();
    }

    public hy1(use useVar, Integer num, boolean z, t69 t69Var, wne wneVar, h0e h0eVar, h0e h0eVar2, int i) {
        this.c = useVar;
        this.d = num;
        this.a = z;
        this.e = t69Var;
        this.f = wneVar;
        this.g = h0eVar;
        this.v = h0eVar2;
        this.b = i;
    }
}
