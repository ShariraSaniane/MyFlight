from flask import Flask, request, jsonify
# from tensorflow import load_model
from tensorflow.keras.models import load_model
import tensorflow as tf
import numpy as np

app = Flask(__name__)

# Load the model
model = tf.keras.models.load_model('../flight_model.h5')

@app.route('/predict', methods=['POST'])
def predict():
    # Get the input data from the request
    data = request.json

    
    # Preprocess the input data
    cloud = data['percentage_cloud']
    wind = data['percentage_wind']
    temperature = data['temperature']
    duration = data['duration_of_flight']
    
    # Create an input array
    input_data = np.array([[cloud, wind, temperature, duration]])
    
    # Make predictions
    predictions = model.predict(input_data)
    predicted_class = np.argmax(predictions, axis=1)[0]
    
    # Prepare the response
    response = {
        'prediction': int(predicted_class)
    }

    print(response)
    
    return jsonify(response)

if __name__ == '__main__':
    app.run()
