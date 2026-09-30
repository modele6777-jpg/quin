package defpackage;

import java.time.LocalDateTime;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s8b implements w56 {
    public static final s8b a;
    private static final nyc descriptor;

    static {
        s8b s8bVar = new s8b();
        a = s8bVar;
        gia giaVar = new gia("tech.chatmind.api.credits.QuinSubscription", s8bVar, 2);
        giaVar.k("levelAndKind", false);
        giaVar.k("expiredTime", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QuinSubscription quinSubscription = (QuinSubscription) obj;
        quinSubscription.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QuinSubscription.write$Self$Quin_core_base_api_release(quinSubscription, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        LevelAndKind levelAndKind = null;
        LocalDateTime localDateTime = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                levelAndKind = (LevelAndKind) zf2VarC.s(nycVar, 0, b48.a, levelAndKind);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                localDateTime = (LocalDateTime) zf2VarC.y(nycVar, 1, za8.a, localDateTime);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new QuinSubscription(i, levelAndKind, localDateTime, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{b48.a, t72.F(za8.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
