package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum oed {
    Short(R.string.sharing_type_short),
    Long(R.string.sharing_type_long),
    Card(R.string.sharing_type_card);

    private final int label;

    oed(int i) {
        this.label = i;
    }

    public final int a() {
        return this.label;
    }
}
