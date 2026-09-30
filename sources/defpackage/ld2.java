package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld2 implements s26 {
    @Override // defpackage.s26
    public final Object u(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, l46 l46Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        ln2 ln2Var = (ln2) obj2;
        n26 n26Var = (n26) obj3;
        x16 x16Var = (x16) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        g09 g09Var = g09.a;
        if (i2 == 0) {
            i = (l46Var.g(g09Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= l46Var.g(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= l46Var.h(zBooleanValue) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((iIntValue & 3072) == 0) {
            i |= l46Var.g(ln2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((iIntValue & 24576) == 0) {
            i |= l46Var.i(n26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((iIntValue & 196608) == 0) {
            i |= l46Var.i(x16Var) ? 131072 : 65536;
        }
        if (l46Var.W(i & 1, (599187 & i) != 599186)) {
            pn2.c(str, zBooleanValue, ln2Var, g09Var, n26Var, x16Var, l46Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
