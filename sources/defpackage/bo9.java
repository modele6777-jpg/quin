package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bo9 extends ewf {
    public final ycc b;
    public final t7 c;
    public final o9 d;
    public final PendingUserProfile e;
    public final ma8 f;
    public final s0e g;
    public final whb v;
    public final whb w;

    public bo9(ycc yccVar, t7 t7Var, o9 o9Var) {
        String birthday;
        this.b = yccVar;
        this.c = t7Var;
        this.d = o9Var;
        PendingUserProfile pendingUserProfileC = f8a.c();
        this.e = pendingUserProfileC;
        String str = (String) yccVar.a("birthday");
        this.f = str != null ? ka8.a(ma8.Companion, str) : (pendingUserProfileC == null || (birthday = pendingUserProfileC.getBirthday()) == null) ? co9.a : ka8.a(ma8.Companion, v4e.m0(10, birthday));
        Boolean bool = Boolean.FALSE;
        s0e s0eVarA = t0e.a(bool);
        this.g = s0eVarA;
        this.v = if9.n(s0eVarA);
        this.w = yccVar.b("pendingNext", bool);
    }
}
