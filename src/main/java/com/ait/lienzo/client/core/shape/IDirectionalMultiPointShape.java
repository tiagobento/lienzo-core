/*
   Copyright (c) 2014,2015 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.client.core.shape;

import com.ait.lienzo.client.core.types.Point2D;
import com.ait.lienzo.shared.core.types.Direction;

public interface IDirectionalMultiPointShape<T extends Shape<T> & IDirectionalMultiPointShape<T>> extends IMultiPointShape<T>
{
    public T setTailDirection(Direction direction);

    public Direction getTailDirection();

    public double getTailOffset();

    public T setTailOffset(double tailOffset);

    public Point2D getTailOffsetStart();

    public T setHeadDirection(Direction direction);

    public Direction getHeadDirection();

    public double getHeadOffset();

    public T setHeadOffset(double offset);

    Point2D getHeadOffsetEnd();
    
    public double getCorrectionOffset();
    
    public T setCorrectionOffset(final double offset);
}