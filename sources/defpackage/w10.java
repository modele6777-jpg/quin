package defpackage;

import ai.askquin.ui.annual.c;
import ai.askquin.ui.annual.model.AnnualActionFor;
import android.app.Application;
import java.util.ArrayList;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w10 extends rcf {
    public static final /* synthetic */ int X = 0;
    public final AnnualActionFor y;
    public final c z;

    public w10(Application application, AnnualActionFor annualActionFor, boolean z, int i, c cVar) {
        ArrayList arrayList;
        String strI = ub3.i("annual_", annualActionFor.name());
        int i2 = t10.a[annualActionFor.ordinal()];
        if (i2 == 1) {
            mx4<g19> mx4Var = g19.b;
            arrayList = new ArrayList(t72.u(mx4Var, 10));
            for (g19 g19Var : mx4Var) {
                arrayList.add(new PatternData(tm7.x(g19Var, application), tm7.x(g19Var, application)));
            }
        } else {
            if (i2 != 2) {
                ap.c();
                throw null;
            }
            mx4<kg4> mx4Var2 = kg4.c;
            arrayList = new ArrayList(t72.u(mx4Var2, 10));
            for (kg4 kg4Var : mx4Var2) {
                arrayList.add(new PatternData(tm7.w(kg4Var, application, z), tm7.w(kg4Var, application, z)));
            }
        }
        super(strI, arrayList, null, 12);
        this.y = annualActionFor;
        this.z = cVar;
        d().e("Resumed drawing from index: " + i);
        if (i > 0) {
            this.v.setValue(tn4.b);
            ynb.V(hwf.a(this), null, null, new s10(this, null), 3);
        }
    }

    @Override // defpackage.rcf
    public final void l(TarotCardChoice tarotCardChoice, int i) {
        super.l(tarotCardChoice, i);
        ynb.V(hwf.a(this), null, null, new u10(this, null), 3);
    }
}
