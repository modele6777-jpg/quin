package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum n3e {
    DEFAULT(0),
    PREVIEW(1),
    VIDEO_RECORD(3),
    STILL_CAPTURE(2),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_CALL(5),
    PREVIEW_VIDEO_STILL(4),
    /* JADX INFO: Fake field, exist only in values array */
    CROPPED_RAW(6);

    private final long value;

    n3e(int i) {
        this.value = i;
    }

    public final long a() {
        return this.value;
    }
}
