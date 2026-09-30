package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.UpdateUserProfileResponse;
import tech.chatmind.api.UserProfileUpdateRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kpf extends gbe implements l26 {
    final /* synthetic */ a26 $onFailureMessage;
    final /* synthetic */ UserProfileUpdateRequestBody $request;
    int label;
    final /* synthetic */ npf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpf(npf npfVar, UserProfileUpdateRequestBody userProfileUpdateRequestBody, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = npfVar;
        this.$request = userProfileUpdateRequestBody;
        this.$onFailureMessage = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kpf(this.this$0, this.$request, this.$onFailureMessage, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        boolean success;
        String message;
        a26 a26Var;
        String errorMessage;
        a26 a26Var2;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                vkf vkfVar = this.this$0.a;
                UserProfileUpdateRequestBody userProfileUpdateRequestBody = this.$request;
                this.label = 1;
                obj = vkfVar.c(userProfileUpdateRequestBody, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            UpdateUserProfileResponse updateUserProfileResponse = (UpdateUserProfileResponse) obj;
            if (!updateUserProfileResponse.getSuccess() && (errorMessage = updateUserProfileResponse.getErrorMessage()) != null) {
                if (v4e.Q(errorMessage)) {
                    errorMessage = null;
                }
                if (errorMessage != null && (a26Var2 = this.$onFailureMessage) != null) {
                    a26Var2.d(errorMessage);
                }
            }
            success = updateUserProfileResponse.getSuccess();
        } catch (Exception e) {
            npf npfVar = this.this$0;
            int i2 = npf.c;
            npfVar.getClass();
            if (e instanceof CancellationException) {
                throw e;
            }
            ynb.h0(e);
            if (tgc.j(e, false)) {
                npfVar.b("Failed to update user profile");
            } else {
                npfVar.d().c("Failed to update user profile", e);
            }
            jzc jzcVar = e instanceof jzc ? (jzc) e : null;
            if (jzcVar != null && (message = jzcVar.getMessage()) != null) {
                String str = v4e.Q(message) ? null : message;
                if (str != null && (a26Var = this.$onFailureMessage) != null) {
                    a26Var.d(str);
                }
            }
            success = false;
        }
        return Boolean.valueOf(success);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kpf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
