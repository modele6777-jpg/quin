package defpackage;

import tech.chatmind.api.events.model.PopupActionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e39 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PopupActionType.values().length];
        try {
            iArr[PopupActionType.SKIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
