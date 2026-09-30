package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Map;
import tech.chatmind.api.User;
import tech.chatmind.api.UserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pmf extends gbe implements l26 {
    final /* synthetic */ boolean $compensated;
    final /* synthetic */ User $user;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmf(User user, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$user = user;
        this.$compensated = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pmf(this.$user, this.$compensated, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        eg5 eg5Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hs3 hs3Var = xqa.z;
        String nickname = this.$user.getNickname();
        if (nickname == null || nickname.length() == 0) {
            nickname = null;
        }
        if (nickname == null) {
            nickname = UserInfo.DEFAULT_NAME;
        }
        isa isaVar = hs3Var.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new imf(isaVar, nickname, null), 3);
        ynb.V(qn2Var, null, null, new lmf(xqa.B.a, this.$user.getEmail(), null), 3);
        ynb.V(qn2Var, null, null, new omf(xqa.P.a, Boolean.valueOf(this.$compensated), null), 3);
        Context contextZ = cn1.z();
        Application application = contextZ instanceof Application ? (Application) contextZ : null;
        if (application != null) {
            User user = this.$user;
            t2b.a(application);
            Map map = t2b.a;
            if (map == null) {
                pa7.g0("supportedPushComponentInitializers");
                throw null;
            }
            u2b u2bVar = (u2b) s72.w0(map.keySet());
            if (u2bVar == null) {
                eg5Var = null;
            } else {
                Map map2 = t2b.a;
                if (map2 == null) {
                    pa7.g0("supportedPushComponentInitializers");
                    throw null;
                }
                Class cls = (Class) map2.get(u2bVar);
                if (cls != null) {
                    eg5Var = (eg5) ta0.v(application).n(cls);
                } else {
                    eg5Var = null;
                }
            }
            if (eg5Var != null) {
                String id = user.getId();
                id.getClass();
                try {
                    hf8.Q.getClass();
                    ef8.a("FirebasePushService").e("Firebase account binding: ".concat(id));
                } catch (Exception e) {
                    tec.t(hf8.Q, "FirebasePushService", "Firebase account binding failed", e);
                }
                return wef.a;
            }
        }
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pmf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
