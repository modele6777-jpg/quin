package defpackage;

import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoEntryRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nda implements x16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ SpreadInfoEntryRoute b;
    public final /* synthetic */ ka9 c;

    public /* synthetic */ nda(ka9 ka9Var, SpreadInfoEntryRoute spreadInfoEntryRoute) {
        this.c = ka9Var;
        this.b = spreadInfoEntryRoute;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        ka9 ka9Var = this.c;
        SpreadInfoEntryRoute spreadInfoEntryRoute = this.b;
        switch (i) {
            case 0:
                ka9.e(ka9Var, new SpreadInfoInputRoute(spreadInfoEntryRoute.getCards(), (List) null, 0, 6, (rp3) null), null, 6);
                break;
            default:
                int size = spreadInfoEntryRoute.getCards().size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add("");
                }
                ka9.e(ka9Var, new QuestionInputRoute(spreadInfoEntryRoute.getCards(), arrayList), null, 6);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ nda(SpreadInfoEntryRoute spreadInfoEntryRoute, ka9 ka9Var) {
        this.b = spreadInfoEntryRoute;
        this.c = ka9Var;
    }
}
