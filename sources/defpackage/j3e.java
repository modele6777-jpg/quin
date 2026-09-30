package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3e implements xzc {
    public final /* synthetic */ k3e a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xjf d;
    public final /* synthetic */ hq0 e;
    public final /* synthetic */ hq0 f;

    public /* synthetic */ j3e(k3e k3eVar, String str, String str2, xjf xjfVar, hq0 hq0Var, hq0 hq0Var2) {
        this.a = k3eVar;
        this.b = str;
        this.c = str2;
        this.d = xjfVar;
        this.e = hq0Var;
        this.f = hq0Var2;
    }

    @Override // defpackage.xzc
    public final void a(zzc zzcVar) {
        k3e k3eVar = this.a;
        if (k3eVar.d() == null) {
            return;
        }
        k3eVar.E();
        k3eVar.C(k3eVar.F(this.b, this.c, this.d, this.e, this.f));
        k3eVar.q();
        zxf zxfVar = k3eVar.s;
        zxfVar.getClass();
        p8c.m();
        Iterator it = zxfVar.a.iterator();
        while (it.hasNext()) {
            zxfVar.c((oif) it.next());
        }
    }
}
