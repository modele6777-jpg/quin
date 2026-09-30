package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SpreadInterpretResponse;
import tech.chatmind.api.SpreadPosition;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class de4 extends gbe implements l26 {
    final /* synthetic */ ed4 $requisite;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de4(r0 r0Var, ed4 ed4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$requisite = ed4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        de4 de4Var = new de4(this.this$0, this.$requisite, xn2Var);
        de4Var.L$0 = obj;
        return de4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        SpreadInterpretResponse spreadInterpretResponse = (SpreadInterpretResponse) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List<SpreadPosition> generatedSpread = spreadInterpretResponse.getGeneratedSpread();
        if (generatedSpread == null) {
            generatedSpread = pu4.a;
        }
        String spreadId = spreadInterpretResponse.getSpreadId();
        String str = spreadId == null ? "" : spreadId;
        this.this$0.d().e("Spread interpret: spreadId=" + str + ", positions=" + generatedSpread.size());
        ArrayList arrayList = new ArrayList(t72.u(generatedSpread, 10));
        for (SpreadPosition spreadPosition : generatedSpread) {
            String name = spreadPosition.getName();
            if (name == null) {
                name = "";
            }
            String description = spreadPosition.getDescription();
            if (description == null) {
                description = "";
            }
            arrayList.add(new PatternData(name, description));
        }
        String strD = str.length() > 0 ? str : null;
        if (strD == null) {
            int size = arrayList.size();
            ale.a.getClass();
            strD = pzd.g(size).d();
        }
        this.this$0.K1(new zc4(this.$requisite.a(), strD, arrayList, this.$requisite, null, null, str, 48));
        r0 r0Var = this.this$0;
        r0Var.getClass();
        ConcurrentHashMap concurrentHashMap = xfb.a;
        xfb.i(r0Var.I0, "spread_select");
        this.this$0.w1(false);
        this.this$0.v1(d.a);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        de4 de4Var = (de4) k((xn2) obj2, (SpreadInterpretResponse) obj);
        wef wefVar = wef.a;
        de4Var.r(wefVar);
        return wefVar;
    }
}
