package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.RedeemPopup;
import tech.chatmind.api.RedeemResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fmb implements w56 {
    public static final fmb a;
    private static final nyc descriptor;

    static {
        fmb fmbVar = new fmb();
        a = fmbVar;
        gia giaVar = new gia("tech.chatmind.api.RedeemResponse", fmbVar, 9);
        giaVar.k("type", true);
        giaVar.k("benefitType", true);
        giaVar.k("tarotIds", true);
        giaVar.k("spreadId", true);
        giaVar.k("grantCount", true);
        giaVar.k("expireDays", true);
        giaVar.k("popup", true);
        giaVar.k("redeemCode", true);
        giaVar.k("retryable", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RedeemResponse redeemResponse = (RedeemResponse) obj;
        redeemResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RedeemResponse.write$Self$Quin_core_base_api_release(redeemResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = RedeemResponse.$childSerializers;
        Boolean bool = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String strO = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        RedeemPopup redeemPopup = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                    i |= 2;
                    break;
                case 2:
                    list = (List) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) zf2VarC.y(nycVar, 3, p4e.a, str3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) zf2VarC.y(nycVar, 4, c77.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) zf2VarC.y(nycVar, 5, c77.a, num2);
                    i |= 32;
                    break;
                case 6:
                    redeemPopup = (RedeemPopup) zf2VarC.y(nycVar, 6, vlb.a, redeemPopup);
                    i |= 64;
                    break;
                case 7:
                    str = (String) zf2VarC.y(nycVar, 7, p4e.a, str);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    bool = (Boolean) zf2VarC.y(nycVar, 8, g11.a, bool);
                    i |= 256;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new RedeemResponse(i, strO, str2, list, str3, num, num2, redeemPopup, str, bool, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = RedeemResponse.$childSerializers;
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        xn7 xn7VarF2 = t72.F((xn7) lw7VarArr[2].getValue());
        xn7 xn7VarF3 = t72.F(p4eVar);
        c77 c77Var = c77.a;
        return new xn7[]{p4eVar, xn7VarF, xn7VarF2, xn7VarF3, t72.F(c77Var), t72.F(c77Var), t72.F(vlb.a), t72.F(p4eVar), t72.F(g11.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
