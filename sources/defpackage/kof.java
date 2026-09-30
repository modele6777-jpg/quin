package defpackage;

import ai.askquin.datastore.model.UserProfile;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kof extends gbe implements l26 {
    final /* synthetic */ yof $userProfileInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kof(yof yofVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$userProfileInfo = yofVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kof(this.$userProfileInfo, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yof yofVar = this.$userProfileInfo;
        String str = yofVar.a;
        String str2 = yofVar.b;
        String str3 = yofVar.c;
        String str4 = yofVar.d;
        Integer num = yofVar.e;
        n2f n2fVar = yofVar.g;
        List list = yofVar.f;
        Boolean bool = yofVar.m;
        Boolean bool2 = yofVar.j;
        Boolean bool3 = yofVar.k;
        boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = this.$userProfileInfo.l;
        return new UserProfile(str, str2, str3, str4, num, list, n2fVar, bool, bool2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(bool4 != null ? bool4.booleanValue() : true));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kof) k((xn2) obj2, (UserProfile) obj)).r(wef.a);
    }
}
