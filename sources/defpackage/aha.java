package defpackage;

import ai.askquin.R;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.c2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aha implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aha(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        nkb adapter;
        int iD;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                oha ohaVar = (oha) obj;
                ohaVar.o(!ohaVar.G1);
                break;
            case 1:
                oha ohaVar2 = ((cha) obj).e;
                zga zgaVar = ohaVar2.F1;
                if (zgaVar != null && ((y45) zgaVar).v(29)) {
                    q1f q1fVarU = ((y45) ohaVar2.F1).u();
                    zga zgaVar2 = ohaVar2.F1;
                    String str = pqf.a;
                    vt3 vt3Var = (vt3) q1fVarU;
                    vt3Var.getClass();
                    ut3 ut3Var = new ut3(vt3Var);
                    ut3Var.b(1);
                    ut3Var.m(1, false);
                    ((y45) zgaVar2).R(ut3Var.a());
                    ohaVar2.E0.c[1] = ohaVar2.getResources().getString(R.string.exo_track_selection_auto);
                    ohaVar2.J0.dismiss();
                    break;
                }
                break;
            case 2:
                iha ihaVar = (iha) obj;
                oha ohaVar3 = ihaVar.w;
                int i2 = -1;
                if (ihaVar.r != null && (recyclerView = ihaVar.q) != null && (adapter = recyclerView.getAdapter()) != null && (iD = ihaVar.q.D(ihaVar)) != -1 && ihaVar.r == adapter) {
                    i2 = iD;
                }
                float[] fArr = oha.W1;
                View view2 = ohaVar3.Y0;
                if (i2 == 0) {
                    gha ghaVar = ohaVar3.F0;
                    view2.getClass();
                    ohaVar3.d(ghaVar, view2);
                } else if (i2 != 1) {
                    ohaVar3.J0.dismiss();
                } else {
                    cha chaVar = ohaVar3.H0;
                    view2.getClass();
                    ohaVar3.d(chaVar, view2);
                }
                break;
            case 3:
                oha ohaVar4 = ((cha) obj).e;
                zga zgaVar3 = ohaVar4.F1;
                if (zgaVar3 != null && ((y45) zgaVar3).v(29)) {
                    q1f q1fVarU2 = ((y45) ohaVar4.F1).u();
                    zga zgaVar4 = ohaVar4.F1;
                    vt3 vt3Var2 = (vt3) q1fVarU2;
                    vt3Var2.getClass();
                    ut3 ut3Var2 = new ut3(vt3Var2);
                    ut3Var2.b(3);
                    ut3Var2.h();
                    ut3Var2.j();
                    ut3Var2.l();
                    ((y45) zgaVar4).R(ut3Var2.a());
                    ohaVar4.J0.dismiss();
                    break;
                }
                break;
            case 4:
                tha thaVar = (tha) obj;
                thaVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    thaVar.r.start();
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    thaVar.s.start();
                }
                break;
            default:
                ((c2) obj).cancel();
                break;
        }
    }
}
