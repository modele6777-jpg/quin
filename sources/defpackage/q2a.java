package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q2a implements vpb {
    public final Set a;
    public final p89 b = new p89(0, new p46[16]);

    public q2a(Set set) {
        this.a = set;
    }

    @Override // defpackage.vpb
    public final void d() {
        p89 p89Var = this.b;
        Object[] objArr = p89Var.a;
        int i = p89Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            vpb vpbVar = ((p46) objArr[i2]).a;
            this.a.remove(vpbVar);
            vpbVar.d();
        }
    }

    @Override // defpackage.vpb
    public final void a() {
    }

    @Override // defpackage.vpb
    public final void c() {
    }
}
