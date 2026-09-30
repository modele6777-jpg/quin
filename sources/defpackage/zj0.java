package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 extends Exception {
    public final wj0 inputAudioFormat;

    public zj0(String str, wj0 wj0Var) {
        super(str + " " + wj0Var);
        this.inputAudioFormat = wj0Var;
    }

    public zj0(wj0 wj0Var) {
        this("Unhandled input format:", wj0Var);
    }
}
