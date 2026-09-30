package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum yrb {
    TestIdNotExists(R.string.personality_report_not_exists),
    Unfinished(R.string.personality_report_not_finished),
    NeedPay(R.string.personality_report_need_unlock),
    Unknown(R.string.unknown_error);

    public static final jy4 a = new jy4(23);
    private final int msgRes;

    yrb(int i) {
        this.msgRes = i;
    }

    public final int a() {
        return this.msgRes;
    }
}
