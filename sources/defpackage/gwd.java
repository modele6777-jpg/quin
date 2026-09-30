package defpackage;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gwd extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ use $textFieldState;
    final /* synthetic */ String $tooLongMessage;
    final /* synthetic */ iwd $viewModel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwd(use useVar, iwd iwdVar, Context context, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$textFieldState = useVar;
        this.$viewModel = iwdVar;
        this.$context = context;
        this.$tooLongMessage = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gwd gwdVar = new gwd(this.$textFieldState, this.$viewModel, this.$context, this.$tooLongMessage, xn2Var);
        gwdVar.L$0 = obj;
        return gwdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (str.length() > 10) {
            String strM0 = v4e.m0(10, str);
            use useVar = this.$textFieldState;
            une uneVarH = useVar.h();
            try {
                uneVarH.c(0, uneVarH.c.length(), strM0);
                useVar.a(uneVarH);
                useVar.c();
                iwd iwdVar = this.$viewModel;
                iwdVar.getClass();
                jsd jsdVar = iwdVar.e;
                int size = jsdVar.size();
                sz9 sz9Var = iwdVar.d;
                int iJ = sz9Var.j();
                if (iJ >= 0 && iJ < size) {
                    jsdVar.set(sz9Var.j(), strM0);
                }
                Toast.makeText(this.$context, this.$tooLongMessage, 0).show();
            } catch (Throwable th) {
                useVar.c();
                throw th;
            }
        } else {
            iwd iwdVar2 = this.$viewModel;
            iwdVar2.getClass();
            jsd jsdVar2 = iwdVar2.e;
            int size2 = jsdVar2.size();
            sz9 sz9Var2 = iwdVar2.d;
            int iJ2 = sz9Var2.j();
            if (iJ2 >= 0 && iJ2 < size2) {
                jsdVar2.set(sz9Var2.j(), str);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        gwd gwdVar = (gwd) k((xn2) obj2, (String) obj);
        wef wefVar = wef.a;
        gwdVar.r(wefVar);
        return wefVar;
    }
}
