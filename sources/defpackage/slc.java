package defpackage;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class slc implements a26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ slc(x16 x16Var, a26 a26Var) {
        this.c = x16Var;
        this.b = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                SeasonalHistoryItem seasonalHistoryItem = (SeasonalHistoryItem) obj;
                seasonalHistoryItem.getClass();
                x16Var.invoke();
                a26Var.d(seasonalHistoryItem);
                return wefVar;
            case 1:
                rmd rmdVar = (rmd) obj;
                rmdVar.getClass();
                if (rmdVar instanceof pmd) {
                    a26Var.d(((pmd) rmdVar).a);
                    return wefVar;
                }
                if (rmdVar.equals(qmd.a)) {
                    x16Var.invoke();
                    return wefVar;
                }
                ap.c();
                return null;
            default:
                yg0 yg0Var = (yg0) obj;
                yg0Var.getClass();
                if (a26Var != null) {
                    a26Var.d(yg0Var);
                }
                if ((yg0Var instanceof AsyncImagePainter$State$Success) || (yg0Var instanceof AsyncImagePainter$State$Error)) {
                    x16Var.invoke();
                }
                return wefVar;
        }
    }

    public /* synthetic */ slc(a26 a26Var, x16 x16Var) {
        this.b = a26Var;
        this.c = x16Var;
    }

    public /* synthetic */ slc(a26 a26Var, x16 x16Var, dnd dndVar, a26 a26Var2) {
        this.b = a26Var;
        this.c = x16Var;
    }
}
