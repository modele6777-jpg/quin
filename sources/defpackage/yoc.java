package defpackage;

import ai.askquin.data.SeasonalReadingStore$Snapshot;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yoc implements w56 {
    public static final yoc a;
    private static final nyc descriptor;

    static {
        yoc yocVar = new yoc();
        a = yocVar;
        gia giaVar = new gia("ai.askquin.data.SeasonalReadingStore.Snapshot", yocVar, 4);
        giaVar.k("cards", false);
        giaVar.k("reading", false);
        giaVar.k("userInfo", true);
        giaVar.k("followUps", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalReadingStore$Snapshot seasonalReadingStore$Snapshot = (SeasonalReadingStore$Snapshot) obj;
        seasonalReadingStore$Snapshot.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalReadingStore$Snapshot.write$Self$Quin_conversation_gpRelease(seasonalReadingStore$Snapshot, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalReadingStore$Snapshot.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        SeasonalReading seasonalReading = null;
        SeasonalUserInfo seasonalUserInfo = null;
        List list2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                seasonalReading = (SeasonalReading) zf2VarC.s(nycVar, 1, boc.a, seasonalReading);
                i |= 2;
            } else if (iJ == 2) {
                seasonalUserInfo = (SeasonalUserInfo) zf2VarC.y(nycVar, 2, msc.a, seasonalUserInfo);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                list2 = (List) zf2VarC.y(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalReadingStore$Snapshot(i, list, seasonalReading, seasonalUserInfo, list2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SeasonalReadingStore$Snapshot.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), boc.a, t72.F(msc.a), t72.F((xn7) lw7VarArr[3].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
