package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wv7 {
    public static final vw3 a = g21.b();

    public static final Owner a(LayoutNode layoutNode) {
        Owner owner = layoutNode.Z;
        if (owner != null) {
            return owner;
        }
        throw kv2.d("LayoutNode should be attached to an owner");
    }
}
