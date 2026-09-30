package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.OffsetDateTime;
import tech.chatmind.api.personality.model.PersonalityAnalysis;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class faa implements w56 {
    public static final faa a;
    private static final nyc descriptor;

    static {
        faa faaVar = new faa();
        a = faaVar;
        gia giaVar = new gia("tech.chatmind.api.personality.model.PersonalityAnalysis", faaVar, 10);
        giaVar.k("currentQuestionIndex", false);
        giaVar.k("desc", false);
        giaVar.k("isFinished", false);
        giaVar.k("name", false);
        giaVar.k("submittedTests", true);
        giaVar.k("testId", false);
        giaVar.k("testImage", false);
        giaVar.k("createdAt", false);
        giaVar.k("updatedAt", false);
        giaVar.k("finishedAt", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PersonalityAnalysis personalityAnalysis = (PersonalityAnalysis) obj;
        personalityAnalysis.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PersonalityAnalysis.write$Self$Quin_core_base_api_release(personalityAnalysis, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        lw7[] lw7VarArr;
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr2 = PersonalityAnalysis.$childSerializers;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        boolean z = true;
        OffsetDateTime offsetDateTime3 = null;
        int i = 0;
        int iT = 0;
        String strO = null;
        boolean z2 = false;
        String strO2 = null;
        int iT2 = 0;
        String strO3 = null;
        String strO4 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    lw7VarArr = lw7VarArr2;
                    z = false;
                    break;
                case 0:
                    lw7VarArr = lw7VarArr2;
                    iT = zf2VarC.t(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    lw7VarArr = lw7VarArr2;
                    strO = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    lw7VarArr = lw7VarArr2;
                    z2 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    lw7VarArr = lw7VarArr2;
                    strO2 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    lw7VarArr = lw7VarArr2;
                    iT2 = zf2VarC.t(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    lw7VarArr = lw7VarArr2;
                    strO3 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                case 6:
                    lw7VarArr = lw7VarArr2;
                    strO4 = zf2VarC.o(nycVar, 6);
                    i |= 64;
                    break;
                case 7:
                    lw7VarArr = lw7VarArr2;
                    offsetDateTime3 = (OffsetDateTime) zf2VarC.s(nycVar, 7, (xn7) lw7VarArr[7].getValue(), offsetDateTime3);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    lw7VarArr = lw7VarArr2;
                    offsetDateTime2 = (OffsetDateTime) zf2VarC.s(nycVar, 8, (xn7) lw7VarArr[8].getValue(), offsetDateTime2);
                    i |= 256;
                    break;
                case 9:
                    lw7VarArr = lw7VarArr2;
                    offsetDateTime = (OffsetDateTime) zf2VarC.y(nycVar, 9, (xn7) lw7VarArr2[9].getValue(), offsetDateTime);
                    i |= 512;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
            lw7VarArr2 = lw7VarArr;
        }
        zf2VarC.b(nycVar);
        return new PersonalityAnalysis(i, iT, strO, z2, strO2, iT2, strO3, strO4, offsetDateTime3, offsetDateTime2, offsetDateTime, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = PersonalityAnalysis.$childSerializers;
        c77 c77Var = c77.a;
        p4e p4eVar = p4e.a;
        return new xn7[]{c77Var, p4eVar, g11.a, p4eVar, c77Var, p4eVar, p4eVar, lw7VarArr[7].getValue(), lw7VarArr[8].getValue(), t72.F((xn7) lw7VarArr[9].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
