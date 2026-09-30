package defpackage;

import java.util.List;
import tech.chatmind.api.events.model.EventRequest;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k05 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m05 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k05(m05 m05Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = m05Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        k05 k05Var = new k05(this.this$0, xn2Var);
        k05Var.L$0 = obj;
        return k05Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x008d A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            az4 az4Var = this.this$0.a;
            EventRequest eventRequest = new EventRequest((String) null, (String) null, false, 7, (rp3) null);
            this.L$0 = xj5Var;
            this.label = 1;
            obj = az4Var.c(eventRequest, this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        NullableServerResponse nullableServerResponse = (NullableServerResponse) obj;
        boolean success = nullableServerResponse.getSuccess();
        List list = pu4.a;
        if (success) {
            List list2 = (List) nullableServerResponse.getData();
            if (list2 != null) {
                list = list2;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (xj5Var.a(list, this) == bw2Var) {
                return bw2Var;
            }
            return wefVar;
        }
        this.this$0.d().g("popup API returned error: " + nullableServerResponse.getErrorMessage());
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (xj5Var.a(list, this) == bw2Var) {
            return bw2Var;
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((k05) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
