package ai.askquin.ui.router;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements w56 {
    public static final f a;
    private static final nyc descriptor;

    static {
        f fVar = new f();
        a = fVar;
        gia giaVar = new gia("ai.askquin.ui.router.AppRoute.GiftCardDetail", fVar, 3);
        giaVar.k("cardId", false);
        giaVar.k("perspective", false);
        giaVar.k("purchaseSuccess", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) obj;
        giftCardDetail.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AppRoute.GiftCardDetail.write$Self$Quin_conversation_gpRelease(giftCardDetail, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AppRoute.GiftCardDetail.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strO = null;
        GiftCardPerspective giftCardPerspective = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                giftCardPerspective = (GiftCardPerspective) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), giftCardPerspective);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new AppRoute.GiftCardDetail(i, strO, giftCardPerspective, z2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, AppRoute.GiftCardDetail.$childSerializers[1].getValue(), g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
