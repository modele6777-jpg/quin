package defpackage;

import ai.askquin.ui.account.component.AuthOption;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zlf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AuthOption.values().length];
        try {
            iArr[AuthOption.Email.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthOption.Phone.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
