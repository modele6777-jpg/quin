package defpackage;

import ai.askquin.ui.share.SharedConversationEntryType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class st2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharedConversationEntryType.values().length];
        try {
            iArr[SharedConversationEntryType.Assistant.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedConversationEntryType.User.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharedConversationEntryType.ClarifyingCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
