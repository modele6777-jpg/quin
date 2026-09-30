package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class adb extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ edb $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adb(edb edbVar, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = edbVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new adb(this.$viewModel, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        gfh gfhVarD;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        q0c q0cVar = (q0c) this.$viewModel.d.getValue();
        if (q0cVar != null) {
            Context context = this.$context;
            edb edbVar = this.$viewModel;
            vb2 vb2VarH = kn2.H(context);
            if (vb2VarH != null) {
                edbVar.getClass();
                Context contextZ = cn1.z();
                Context applicationContext = contextZ.getApplicationContext();
                if (applicationContext != null) {
                    contextZ = applicationContext;
                }
                new p3h(contextZ);
                Handler handler = new Handler(Looper.getMainLooper());
                tjg tjgVar = (tjg) q0cVar;
                if (tjgVar.b) {
                    gfhVarD = Tasks.d(null);
                } else {
                    Intent intent = new Intent(vb2VarH, (Class<?>) PlayCoreDialogWrapperActivity.class);
                    intent.putExtra("confirmation_intent", tjgVar.a);
                    intent.putExtra("window_flags", vb2VarH.getWindow().getDecorView().getWindowSystemUiVisibility());
                    gle gleVar = new gle();
                    intent.putExtra("result_receiver", new py2(handler, gleVar));
                    vb2VarH.startActivity(intent);
                    gfhVarD = gleVar.a;
                }
                gfhVarD.b(new r45(17, edbVar));
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        adb adbVar = (adb) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        adbVar.r(wefVar);
        return wefVar;
    }
}
