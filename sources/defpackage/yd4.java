package defpackage;

import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yd4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClarifyingCardState.values().length];
        try {
            iArr[ClarifyingCardState.Interpreting.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClarifyingCardState.Completed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClarifyingCardState.Skipped.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClarifyingCardState.Stale.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ClarifyingCardState.PendingDecision.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ClarifyingCardState.Drawing.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[sfb.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
