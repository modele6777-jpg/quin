package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww7 extends m4 {
    public final tw7 c;
    public final uz7 d;
    public final int e;
    public final /* synthetic */ uz7 f;
    public final /* synthetic */ jx7 g;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww7(tw7 tw7Var, uz7 uz7Var, int i, jx7 jx7Var, int i2, int i3, long j) {
        super(3);
        this.f = uz7Var;
        this.g = jx7Var;
        this.v = i2;
        this.w = i3;
        this.x = j;
        this.c = tw7Var;
        this.d = uz7Var;
        this.e = i;
    }

    public final ax7 B0(long j, int i, int i2, int i3, int i4) {
        int i5;
        tw7 tw7Var = this.c;
        Object objB = tw7Var.b(i);
        Object objZ = tw7Var.b.z(i);
        List listS0 = s0(this.d, i, j);
        if (kl2.f(j)) {
            i5 = kl2.j(j);
        } else {
            if (!kl2.e(j)) {
                l37.a("does not have fixed height");
            }
            i5 = kl2.i(j);
        }
        cv7 layoutDirection = this.f.b.getLayoutDirection();
        oz7 oz7Var = this.g.m;
        return new ax7(i, objB, i5, i4, layoutDirection, this.v, this.w, listS0, this.x, objZ, oz7Var, j, i2, i3);
    }

    @Override // defpackage.m4
    public final vz7 q0(int i, int i2, int i3, long j) {
        return B0(j, i, i2, i3, this.e);
    }
}
