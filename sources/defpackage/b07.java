package defpackage;

import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b07 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InAppMessageType.values().length];
        try {
            iArr[InAppMessageType.ManualAction.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppMessageType.ManualText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InAppMessageType.ManualImage.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InAppMessageType.ManualFull.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
