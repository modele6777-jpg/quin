package defpackage;

import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b48 implements w56 {
    public static final b48 a;
    private static final nyc descriptor;

    static {
        b48 b48Var = new b48();
        a = b48Var;
        gia giaVar = new gia("tech.chatmind.api.credits.LevelAndKind", b48Var, 2);
        giaVar.k("level", false);
        giaVar.k("kind", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        LevelAndKind levelAndKind = (LevelAndKind) obj;
        levelAndKind.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        LevelAndKind.write$Self$Quin_core_base_api_release(levelAndKind, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = LevelAndKind.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        o7e o7eVar = null;
        SubscriptionKind subscriptionKind = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                o7eVar = (o7e) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), o7eVar);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                subscriptionKind = (SubscriptionKind) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), subscriptionKind);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new LevelAndKind(i, o7eVar, subscriptionKind, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = LevelAndKind.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
