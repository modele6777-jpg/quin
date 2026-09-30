package ai.askquin.ui.dailycard;

import defpackage.a26;
import defpackage.job;
import defpackage.qb9;
import defpackage.wef;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements a26 {
    public final /* synthetic */ int a;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        qb9 qb9Var = (qb9) obj;
        switch (i) {
            case 0:
                qb9Var.getClass();
                DailyCardShuffleRoute dailyCardShuffleRoute = DailyCardShuffleRoute.INSTANCE;
                dailyCardShuffleRoute.getClass();
                qb9Var.h = dailyCardShuffleRoute;
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                break;
            default:
                qb9Var.getClass();
                qb9Var.g = job.a.b(DailyCardSkinPickerRoute.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                break;
        }
        return wefVar;
    }
}
