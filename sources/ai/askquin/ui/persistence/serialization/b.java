package ai.askquin.ui.persistence.serialization;

import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return SerializableDivination._childSerializers$_anonymous_();
            case 1:
                return SerializableDivination._childSerializers$_anonymous_$0();
            case 2:
                return SerializableDivination._childSerializers$_anonymous_$1();
            case 3:
                return SerializableDivination._childSerializers$_anonymous_$2();
            case 4:
                return SerializableDivination._childSerializers$_anonymous_$3();
            case 5:
                return SerializableDrawBeforeQuestion._childSerializers$_anonymous_();
            default:
                return SerializableDrawBeforeQuestion._childSerializers$_anonymous_$0();
        }
    }
}
