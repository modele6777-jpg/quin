package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jbf {
    public vea a;
    public vea b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    public final void a(zse zseVar) {
        vea veaVar;
        zse zseVar2;
        this.e = false;
        vea veaVar2 = this.a;
        if (pa7.t(zseVar, veaVar2 != null ? (zse) veaVar2.c : null)) {
            return;
        }
        String str = zseVar.a.b;
        vea veaVar3 = this.a;
        boolean zT = pa7.t(str, (veaVar3 == null || (zseVar2 = (zse) veaVar3.c) == null) ? null : zseVar2.a.b);
        vea veaVar4 = this.a;
        if (zT) {
            if (veaVar4 != null) {
                veaVar4.c = zseVar;
                return;
            }
            return;
        }
        this.a = new vea(18, veaVar4, zseVar);
        this.b = null;
        int length = zseVar.a.b.length() + this.c;
        this.c = length;
        if (length > 100000) {
            vea veaVar5 = this.a;
            if ((veaVar5 != null ? (vea) veaVar5.b : null) == null) {
                return;
            }
            while (true) {
                if (veaVar5 == null) {
                    veaVar = null;
                } else {
                    vea veaVar6 = (vea) veaVar5.b;
                    if (veaVar6 != null) {
                        veaVar = (vea) veaVar6.b;
                    } else {
                        veaVar = null;
                    }
                }
                if (veaVar == null) {
                    break;
                } else {
                    veaVar5 = (vea) veaVar5.b;
                }
            }
            if (veaVar5 != null) {
                veaVar5.b = null;
            }
        }
    }
}
