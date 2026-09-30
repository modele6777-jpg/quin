package defpackage;

import ai.askquin.ui.annual.h;
import tech.chatmind.api.annual.model.UserPostContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e50 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(h hVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = hVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        e50 e50Var = new e50(this.this$0, xn2Var);
        e50Var.L$0 = obj;
        return e50Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        UserPostContent userPostContent;
        f30 f30Var = (f30) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (f30Var != null && (userPostContent = f30Var.a) != null) {
            s0e s0eVar = this.this$0.d;
            String gender = userPostContent.getGender();
            a56.a.getClass();
            a56 a56VarP = y25.p(gender);
            String careerStatus = userPostContent.getCareerStatus();
            pu1.a.getClass();
            pu1 pu1VarV = m8c.v(careerStatus);
            use useVar = new use(userPostContent.getNickname(), 2);
            String loveStatus = userPostContent.getLoveStatus();
            kpb.a.getClass();
            w50 w50Var = new w50(a56VarP, useVar, yx4.h(loveStatus), pu1VarV);
            s0eVar.getClass();
            s0eVar.n(null, w50Var);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        e50 e50Var = (e50) k((xn2) obj2, (f30) obj);
        wef wefVar = wef.a;
        e50Var.r(wefVar);
        return wefVar;
    }
}
