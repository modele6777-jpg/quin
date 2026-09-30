package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.Gender;
import tech.chatmind.api.UserProfileUpdateRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface gpf {
    static Object a(gpf gpfVar, String str, Gender gender, String str2, String str3, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, a26 a26Var, zn2 zn2Var, int i) {
        String str4 = (i & 1) != 0 ? null : str;
        Gender gender2 = (i & 2) != 0 ? null : gender;
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        List list3 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : list;
        List list4 = (i & 256) != 0 ? null : list2;
        Boolean bool4 = (i & 512) != 0 ? null : bool;
        Boolean bool5 = (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : bool2;
        Boolean bool6 = (i & 2048) != 0 ? null : bool3;
        a26 a26Var2 = (i & 4096) != 0 ? null : a26Var;
        npf npfVar = (npf) gpfVar;
        npfVar.getClass();
        UserProfileUpdateRequestBody userProfileUpdateRequestBody = new UserProfileUpdateRequestBody(str4, gender2 != null ? new Integer(gender2.ordinal()) : null, str5, str6, null, null, null, list3, list4, bool4, bool5, bool6);
        js3 js3Var = ga4.a;
        return ynb.p0(hr3.c, new kpf(npfVar, userProfileUpdateRequestBody, a26Var2, null), zn2Var);
    }
}
