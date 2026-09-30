package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gzb implements nd6 {
    public final a26 a;
    public final Integer b;
    public final Long c;
    public final za2 d;
    public volatile yy5 e;
    public volatile Long f;
    public rtb g;

    public gzb(a26 a26Var, Integer num, Long l) {
        a26Var.getClass();
        this.a = a26Var;
        this.b = num;
        this.c = l;
        this.d = new za2();
    }

    @Override // defpackage.nd6
    public final void a() {
        this.d.R(new fzb(3, null));
    }

    @Override // defpackage.nd6
    public final void b() {
        this.d.R(new fzb(3, null));
    }

    @Override // defpackage.nd6
    public final void c() {
        this.d.R(new fzb(3, null));
    }

    public gzb(Map map) {
        this(new xq2(1, map), null, null);
    }
}
