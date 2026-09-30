package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bgh {
    public static final agh f;
    public static final agh h;
    public static final ngh a = new ngh("cause", Throwable.class, false, false);
    public static final ngh b = new ngh("ratelimit_count", Integer.class, false, false);
    public static final ngh c = new ngh("sampling_count", Integer.class, false, false);
    public static final ngh d = new ngh("ratelimit_period", vfh.class, false, false);
    public static final ngh e = new ngh("skipped", Integer.class, false, false);
    public static final ngh g = new ngh("forced", Boolean.class, false, false);
    public static final ngh i = new ngh("stack_size", ugh.class, false, false);

    static {
        boolean z = true;
        f = new agh("group_by", Object.class, z, z, 0);
        h = new agh("tags", ykg.class, false, z, 1);
    }
}
