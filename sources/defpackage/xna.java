package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xna implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ az1 b;

    public /* synthetic */ xna(az1 az1Var, int i) {
        this.a = i;
        this.b = az1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        az1 az1Var = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "start_reading", "pathway", "general_additional_info");
                if (az1Var != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1Var.a.a), new iy9("session_id", az1Var.b)).forEach(new al(new gl(2, l1fVar, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 26), 7));
                }
                break;
            case 1:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "skip_and_start_reading", "pathway", "general_additional_info");
                if (az1Var != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1Var.a.a), new iy9("session_id", az1Var.b)).forEach(new al(new gl(2, l1fVar2, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 27), 8));
                }
                break;
            case 2:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", "voice_record_start", "pathway", "general_additional_info");
                if (az1Var != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1Var.a.a), new iy9("session_id", az1Var.b)).forEach(new al(new gl(2, l1fVar3, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 28), 9));
                }
                break;
            case 3:
                l1f l1fVar4 = (l1f) obj;
                kv2.y(l1fVar4, "btn", "add_more_info", "pathway", "general_additional_info");
                if (az1Var != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1Var.a.a), new iy9("session_id", az1Var.b)).forEach(new al(new v5c(2, l1fVar4, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 13), 17));
                }
                break;
            default:
                l1f l1fVar5 = (l1f) obj;
                kv2.y(l1fVar5, "btn", "start_reading_directly", "pathway", "general_additional_info");
                if (az1Var != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1Var.a.a), new iy9("session_id", az1Var.b)).forEach(new al(new v5c(2, l1fVar5, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 14), 16));
                }
                break;
        }
        return wefVar;
    }
}
